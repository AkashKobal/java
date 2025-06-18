import React, { useEffect, useState } from "react";
import axios from "axios";

const JobList = () => {
    const [jobs, setJobs] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        axios
            .get("http://localhost:5000/jobs")
            .then((res) => {
                setJobs(res.data || []);
                setLoading(false);
            })
            .catch((err) => {
                console.error("Error fetching jobs:", err);
                setLoading(false);
            });
    }, []);

    return (
        <div className="min-h-screen bg-gray-100 py-10 px-4 sm:px-8">
            <h1 className="text-3xl font-bold text-center mb-8 text-blue-700">Latest Job Listings</h1>

            {loading ? (
                <div className="text-center text-lg text-gray-600">Loading jobs...</div>
            ) : jobs.length === 0 ? (
                <div className="text-center text-lg text-gray-600">No jobs found.</div>
            ) : (
                <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-6">
                    {jobs.map((job) => (
                        <div
                            key={job.id}
                            className="bg-white rounded-xl shadow-md p-6 hover:shadow-lg transition duration-300"
                        >
                            <h2 className="text-xl font-semibold text-gray-800">{job.title}</h2>
                            <p className="text-gray-600 font-medium">{job.company}</p>
                            <p className="text-sm text-gray-500 mb-2">
                                {job.location} &middot; {job.type}
                            </p>
                            <p className="text-green-600 font-semibold text-sm">{job.salary}</p>

                            <div className="mt-3">
                                <span className="text-sm font-semibold text-gray-700">Skills:</span>
                                <div className="flex flex-wrap gap-2 mt-1">
                                    {job.skills.map((skill, index) => (
                                        <span
                                            key={index}
                                            className="bg-blue-100 text-blue-800 text-xs font-medium px-2 py-1 rounded-full"
                                        >
                                            {skill}
                                        </span>
                                    ))}
                                </div>
                            </div>

                            <p className="text-sm text-gray-600 mt-4">
                                {job.description.length > 100
                                    ? job.description.substring(0, 100) + "..."
                                    : job.description}
                            </p>

                            <p className="text-xs text-gray-400 mt-4">Posted on: {job.postedDate}</p>
                        </div>
                    ))}
                </div>
            )}
        </div>
    );
};

export default JobList;
